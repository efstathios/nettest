import { NettestClient2Page } from './app.po';

describe('nettest-client2 App', () => {
  let page: NettestClient2Page;

  beforeEach(() => {
    page = new NettestClient2Page();
  });

  it('should display welcome message', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('Welcome to app!');
  });
});
