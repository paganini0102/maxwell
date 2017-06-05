package com.zendesk.maxwell.producer;

import com.zendesk.maxwell.row.RowMap;

public class StdoutProducer extends AbstractProducer {
	@Override
	public void push(RowMap r) throws Exception {
		String output = r.toJSON(outputConfig);

		if ( output != null )
			System.out.println(output);

		this.context.setPosition(r);
	}
}
